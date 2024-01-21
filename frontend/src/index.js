import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import Quiz from './quiz/Quiz'
import Login from './login/Login'
import Navbar from './landing/NavBar';
import reportWebVitals from './reportWebVitals';
import { Amplify } from 'aws-amplify';
import amplifyconfig from './amplifyconfiguration.json';
import App from './App';
Amplify.configure(amplifyconfig);

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App/>
  </React.StrictMode>
);