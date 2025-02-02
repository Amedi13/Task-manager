import axios from 'axios';

const API_BASE_URL = 'http://localhost:8080';

export const getTasks = () => axios.get(`${API_BASE_URL}/tasks`);
export const createTask = (task) => axios.post(`${API_BASE_URL}/tasks`, task);
export const updateTask = (id, task) => axios.put(`${API_BASE_URL}/tasks/${id}`, task);
export const deleteTask = (id) => axios.delete(`${API_BASE_URL}/tasks/${id}`);
