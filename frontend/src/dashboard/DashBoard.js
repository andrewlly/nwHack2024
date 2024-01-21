import React from 'react';
import './Dashboard.css';
import Task from './Task';
import Profile from './Profile';
import Plant from './Plant';

const Dashboard = () => {
  const currentDate = new Date();
  const options = { year: 'numeric', month: 'long', day: 'numeric' };
  const formattedDate = currentDate.toLocaleDateString('en-US', options);

  return (
    <div className="dashboard-container">
      <div className="sidebar">
        <div className="sidebar-logo" />
        <p>home</p>
        <p>community</p>
      </div>

      <div className="main-content">
        <div className="header">
          <h2>Dashboard</h2>
          <h3>{formattedDate}</h3>
        </div>
        <div className="content-box">
          <h1 className="greeting">Aloe, Jane!</h1>
        </div>
        <h2 className="greeting">Today's tasks:</h2>
        <Task className="task" />
        <Task className="task" />
        <Task className="task" />
      </div>

      <div className="plants-container">
        <Profile className="profile" />
        <div className="plants-header">
          <h2>Plants</h2>
          <div className="add-plant-button">+</div>
        </div>
        <Plant className="plant" />
      </div>
    </div>
  );
};

export default Dashboard;
