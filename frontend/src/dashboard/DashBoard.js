import React, { useEffect, useState } from 'react';
import './Dashboard.css';
import Task from './Task';
import Profile from './Profile';
import Plant from './Plant';
import NewPlant from './NewPlant';
import { Modal, Box } from '@mui/material';
import Recommendation from './RecoModal';
import { useLocation } from 'react-router-dom';


const Dashboard = () => {
  const location = useLocation();
  const currentDate = new Date();
  const options = { year: 'numeric', month: 'long', day: 'numeric' };
  const formattedDate = currentDate.toLocaleDateString('en-US', options);
  const modalStyle = {
    position: 'absolute',
    top: '50%',
    left: '50%',
    transform: 'translate(-50%, -50%)',
    width: 600,
    height: 350,
    bgcolor: '#F8F5EC',
    border: '2px solid #000',
    boxShadow: '0.25rem 0.25rem #0A3C5',
    p: 4,
  };

  const [newPlantOpen, setNewPlantOpen] = useState(false);
  const [recommendedOpen, setRecommendedOpen] = useState(true);
  const [modalPlant, setModalPlant] = useState("");
  const [isLoading, setIsLoading] = useState(false);
  const [token, setToken] = useState(location.state.token);
  const [data, setData] = useState([[]]);


  useEffect(() => {
    handleToken();
  }, [token, newPlantOpen]);

  const handleExit = () => {
    setNewPlantOpen(false);
    setRecommendedOpen(false);
  }

  const openNewPlant = (plantType) => {
    setModalPlant(plantType);
    setNewPlantOpen(true);
    setRecommendedOpen(false);
  }

  const handleToken = () => {
    getData();
  }

  const getData = () => {
    setIsLoading(true);
    console.log('GETTING DATA');
    fetch('http://localhost:8080/dashboard', {
      method: "GET",
      headers: {
        "Content-type": "application/json; charset=UTF-8",
        "Origin": "http://localhost:3000",
        "Authorization": token
      },
      credentials: "include"
    })
        .then(response => response.json())
        .then(json => {
          console.log(json);
          setData(json);
          setIsLoading(false)
        })
        .catch(error => console.error(error));
  }

  return (
      <div className="dashboard-container">
        <Modal open={newPlantOpen || recommendedOpen}>
          <Box sx={modalStyle}>
            <div className="plant-count-badge" onClick={() => handleExit()}>X</div>
            {newPlantOpen && <NewPlant plantType={modalPlant} token={token}/>}
            {recommendedOpen && <Recommendation openNewPlant={openNewPlant}/>}
          </Box>
        </Modal>
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
            <div className="add-plant-button" onClick={() => setNewPlantOpen(true)}>+</div>
          </div>
          <Plant className="plant" />
        </div>
      </div>
  );
};

export default Dashboard;