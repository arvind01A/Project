document.addEventListener("DOMContentLoaded", function() {
    // Dummy data, replace with actual data fetching logic
    const totalPatients = 123;
    const pendingReports = 45;
    const completedReports = 78;

    document.getElementById('totalPatients').textContent = totalPatients;
    document.getElementById('pendingReports').textContent = pendingReports;
    document.getElementById('completedReports').textContent = completedReports;

    document.getElementById('loginForm').addEventListener('submit', function(event) {
        event.preventDefault();
        // Add login logic here
        alert('Login functionality not implemented.');
    });

    document.getElementById('registerForm').addEventListener('submit', function(event) {
        event.preventDefault();
        // Add registration logic here
        alert('Registration functionality not implemented.');
    });
});
