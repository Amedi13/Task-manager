import React, { useState } from "react";
import { createTask } from "../api/taskService";

const TaskForm = ({ onTaskCreated }) => {
    const [title, setTitle] = useState("");
    const [description, setDescription] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();
        const newTask = {
            title,
            description,
            status: "Pending",
            priority: "Low",
        };
        createTask(newTask)
            .then((response) => {
                onTaskCreated(response.data);
                setTitle("");
                setDescription("");
            })
            .catch((error) => console.error("Error creating task:", error));
    };

    return (
        <form onSubmit={handleSubmit} style={styles.form}>
            <input
                type="text"
                placeholder="Task Title"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                style={styles.input}
            />
            <textarea
                placeholder="Task Description"
                value={description}
                onChange={(e) => setDescription(e.target.value)}
                style={styles.input}
            ></textarea>
            <button type="submit" style={styles.button}>
                Create Task
            </button>
        </form>
    );
};

const styles = {
    form: {
        margin: "20px auto",
        maxWidth: "400px",
        padding: "20px",
        background: "#fff",
        borderRadius: "8px",
        boxShadow: "0 4px 6px rgba(0, 0, 0, 0.1)",
    },
    input: {
        width: "100%",
        padding: "10px",
        marginBottom: "10px",
        borderRadius: "4px",
        border: "1px solid #ddd",
    },
    button: {
        width: "100%",
        padding: "10px",
        background: "#007BFF",
        color: "white",
        border: "none",
        borderRadius: "4px",
        cursor: "pointer",
    },
};

export default TaskForm;
