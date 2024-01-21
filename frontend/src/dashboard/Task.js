import React from 'react';
import './Dashboard.css';
import { useState } from 'react';

const Task = () => {
    const [finished, setFinished] = useState(false);
    const handleClick = () => {
        setFinished(!finished);
      };
    
  return (
<div className="taskbar" style={{
    backgroundColor: finished ? '#E7E7E7' : 'white',
    border: finished ? '2px solid black' : '2px solid #92D3B5',
}}>
    <div style={{ display: 'flex', alignItems: 'center' }}>
        <div style={{ backgroundColor: '#B4E8D0', width: '5vh', height: '5vh' }}></div>
        <p style={{ margin: '0', marginLeft: '10px' }}>Tomato - This is the task message</p>
    </div>
    <input type="checkbox" onClick={handleClick}/>
    </div>
  );
};

export default Task;