import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import Quiz from './quiz/Quiz'
import Login from './login/Login'
import Navbar from './landing/NavBar';
import reportWebVitals from './reportWebVitals';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <Landing /> */}
    {/* <Quiz /> */}
    <Login/>
  </React.StrictMode>
);