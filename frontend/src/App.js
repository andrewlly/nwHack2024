import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Landing from './landing/Landing';
import Login from './login/Login';
import Dashboard from './dashboard/DashBoard';
import Quiz from './quiz/Quiz';
import { withAuthenticator, Button, Heading } from '@aws-amplify/ui-react';
import '@aws-amplify/ui-react/styles.css';

const App = ({ signOut, user }) => {
  return (
    <Router>
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/get-started" element={<Quiz />} />
        <Route path="/" element={<Landing />} />
      </Routes>
    </Router>
  );
};

export default withAuthenticator(App);
