import type { MetaFunction } from "@remix-run/node";
import { useEffect, useState } from "react";

export const meta: MetaFunction = () => {
  return [
    { title: "Questions" },
    { name: "description", content: "Welcome to Remix!" },
  ];
};

export default function Index() {
  const [questions, setQuestions] = useState([]);
  useEffect(() => {
    fetch('http://localhost:8090/questions')
      .then(response => response.json())
      .then(data => setQuestions(data));
  }, []);
  const [selectedAnswers, setSelectedAnswers] = useState({});
  const [error, setError] = useState('');

  const handleCheckboxChange = (questionId, answerId) => {
    setSelectedAnswers((prevSelected) => ({
      ...prevSelected,
      [questionId]: answerId,
    }));
  };  
  const handleSubmit = () => {
    const allAnswered = questions.every(question => selectedAnswers[question.id]);

    if (!allAnswered) {
      setError('Por favor, responde todas las preguntas antes de enviar.');
    } else {
      setError('');
      console.log("Submitted answers:", selectedAnswers);
      // Add your submit logic here, like sending data to a server
    }
  };

  return (
    <div className="posts-container space-y-6 p-6 bg-gray-100 min-h-screen">
      {questions.map((question, j) => (
        <div
          className="post-card p-6 bg-white rounded-xl shadow-lg transition duration-300 hover:shadow-2xl"
          key={question.id}
        >
          <h2 className="post-title text-2xl font-bold text-gray-800 mb-4">
            Question {j + 1}
          </h2>
          <p className="post-body text-lg text-gray-600 mb-6">
            {question.text}
          </p>

          <div className="space-y-3">
            {question.answers.map((answer) => (
              <div key={answer.id} className="flex items-center">
                <label className="flex items-center space-x-3">
                  <input
                    type="checkbox"
                    className="form-checkbox h-5 w-5 text-indigo-600 border-gray-300 rounded focus:ring-indigo-500 cursor-pointer"
                    checked={selectedAnswers[question.id] === answer.id}
                    onChange={() =>
                      handleCheckboxChange(question.id, answer.id)
                    }
                  />
                  <span className="text-gray-700 text-lg">
                    {answer.paragraph}
                  </span>
                </label>
              </div>
            ))}
          </div>
        </div>
      ))}

      {error && <p className="text-red-500 font-bold text-center">{error}</p>}


      <div className="button mt-6 text-center">
        <button
          onClick={handleSubmit}
          className="bg-indigo-600 text-white px-5 py-3 rounded-lg hover:bg-indigo-700 transition duration-300"
        >
          Submit Answers
        </button>
      </div>
    </div>
  );
};