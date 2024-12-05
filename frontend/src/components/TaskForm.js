import React, { useState } from 'react';
import { createTask } from '../services/taskService';

const TaskForm = ({ onTaskAdded }) => {
    const [title, setTitle] = useState('');
    const [description, setDescription] = useState('');

    const handleSubmit = (e) => {
        e.preventDefault();
        const newTask = { title, description, status: 'Pending', priority: 'Low' };

        createTask(newTask)
            .then(() => {
                onTaskAdded();
                setTitle('');
                setDescription('');
            })
            .catch((error) => {
                console.error('Error creating task:', error);
            });
    };

    return (
        <form onSubmit={handleSubmit}>
            <div>
                <label>Title</label>
                <input
                    type="text"
                    value={title}
                    onChange={(e) => setTitle(e.target.value)}
                    required
                />
            </div>
            <div>
                <label>Description</label>
                <textarea
                    value={description}
                    onChange={(e) => setDescription(e.target.value)}
                    required
                ></textarea>
            </div>
            <button type="submit">Add Task</button>
        </form>
    );
};

export default TaskForm;
