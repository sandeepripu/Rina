const express = require("express");
const path = require("path");

const app = express();
const PORT = process.env.PORT || 10000;

// Serve static files (CSS, JS, images)
app.use(express.static(path.join(__dirname, "src", "main", "webapp")));

app.get("/", (req, res) => {
    res.sendFile(path.join(__dirname, "src", "main", "webapp", "index.html"));
});

app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
});
