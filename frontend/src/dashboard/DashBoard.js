import React from 'react';
import './Dashboard.css';
import Task from './Task';

const Dashboard = () => {
    const currentDate = new Date();
    const month = currentDate.getMonth() + 1; // Months are zero-based, so we add 1
    const day = currentDate.getDate();
    const year = currentDate.getFullYear();
    const formattedDate = `${month}/${day}/${year}`;

  return (
    <div style={{backgroundColor: '#F8F5EC', display: 'flex', flexDirection: 'row'}}>
        <div style={{ position: 'sticky', width: '15vh', height: '100vh', backgroundColor: '#ABE0F7', display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'flex-start', paddingTop: '5vh'}}>
            <div style={{ width: '10vh', height: '10vh', backgroundColor: '#8EC6DD', borderRadius: '100%', display: 'flex', flexDirection: 'row', marginBottom: '10px' }}/>
            <p>home</p>
            <p>community</p>
        </div>
        <div style={{width: '65vw', display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'flex-start', padding: '5vh'}}>
            <div style={{ display: 'flex', justifyContent: 'space-between', alignItems: 'center', flexDirection: 'row', width: '100%'}}>
                <h2>Dashboard</h2>
                <h3>{formattedDate}</h3>
            </div>
            <div style={{height: '30vh', width: '100%', backgroundColor: '#B4E8D0'}}>
                <h1>Aloe, Jane!</h1>
            </div>
            <h2 style={{ textAlign: 'left', width: '100%'}}>Today's tasks:</h2>
            <Task />
            <Task />
            <Task />
        </div>
    </div>
  );
};

export default Dashboard;