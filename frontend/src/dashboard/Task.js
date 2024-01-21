import React, { useState } from 'react';
import './Dashboard.css';

const Task = () => {
  const [finished, setFinished] = useState(false);

  const handleClick = () => {
    setFinished(!finished);
  };

  return (
    <div className={`taskbar ${finished ? 'finished-task' : ''}`}>
      <div className="task-content-container">
        <div className="task-icon"></div>
        <p className="task-message">Tomato - This is the task message</p>
      </div>
      <input type="checkbox" className="task-checkbox" onClick={handleClick} />
    </div>
  );
};

export default Task;
