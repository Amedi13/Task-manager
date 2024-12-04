import React, { useEffect, useState } from "react";
import { getAllTasks } from "../api/taskService";

const TaskList = () => {
    const [tasks, setTasks] = useState([]);

    useEffect(() => {
        getAllTasks()
            .then((response) => setTasks(response.data))
            .catch((error) => console.error("Error fetching tasks:", error));
    }, []);

    return (
        <div style={styles.container}>
            <h2>Task List</h2>
            {tasks.map((task) => (
                <div key={task.id} style={styles.card}>
                    <h3>{task.title}</h3>
                    <p>{task.description}</p>
                    <p>
                        <strong>Status:</strong> {task.status}
                    </p>
                    <button style={styles.editBtn}>Edit</button>
                    <button style={styles.deleteBtn}>Delete</button>
                </div>
            ))}
        </div>
    );
};

const styles = {
    container: {
        padding: "20px",
        maxWidth: "600px",
        margin: "auto",
    },
    card: {
        background: "#fff",
        padding: "15px",
        marginBottom: "10px",
        borderRadius: "8px",
        boxShadow: "0 4px 6px rgba(0, 0, 0, 0.1)",
    },
    editBtn: {
        background: "#007BFF",
        color: "white",
        border: "none",
        padding: "5px 10px",
        borderRadius: "4px",
        marginRight: "10px",
        cursor: "pointer",
    },
    deleteBtn: {
        background: "#DC3545",
        color: "white",
        border: "none",
        padding: "5px 10px",
        borderRadius: "4px",
        cursor: "pointer",
    },
};

export default TaskList;
