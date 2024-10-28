import axios from 'axios';

const API_URL = 'http://localhost:8080/api/finance';

export const registerUser = (userData) => axios.post(`${API_URL}/register`, userData);

export const fetchTransactions = () => axios.get(`${API_URL}/transactions`);

export const addTransaction = (transactionData) => axios.post(`${API_URL}/transaction/add`, transactionData);
