import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Landing from './landing/Landing';
import Login from './login/Login';
import CreateAccount from './create_account/CreateAccount';
import Dashboard from './dashboard/DashBoard';
import Community from './dashboard/Community';
import Quiz from './quiz/Quiz';

const App = () => {
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/create-account" element={<CreateAccount />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/quiz" element={<Quiz />} />
        <Route path="/community" element={<Community />} />
        <Route path="/" element={<Landing />} />
      </Routes>
    </Router>
  );
};

export default App;
