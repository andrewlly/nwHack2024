import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import Quiz from './quiz/Quiz'
import Login from './login/Login'
import Navbar from './landing/NavBar';
import App from './App';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>
);