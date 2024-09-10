let table = new DataTable('#inventary', {
    paging: true,
    scrollCollapse: true,
    ajax: {
        url: "/inventary/all",
        dataSrc: ''
    },
    columns: [
        { data: 'id' },
        { data: 'name' },
        { data: 'category' },
        { data: 'quantity' },
    ]
});
