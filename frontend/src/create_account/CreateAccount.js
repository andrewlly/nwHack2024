import React from 'react';
import './CreateAccount.css';
import { useState } from 'react';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';

const CreateAccount = () => {
  const [username, setUsername] = useState('');
  const [phoneNumber, setPhoneNumber] = useState(null);
  const [password, setPassword] = useState('');
  const [email, setEmail] = useState('');
  const navigate = useNavigate();
  const [isLoading, setIsLoading] = useState(false);


  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handlePhoneNumberChange = (e) => {
    setPhoneNumber(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();
  };

  const handleClicked = () => {
    tryAccountCreate();
  }

  const tryAccountCreate = () => {
    setIsLoading(true);
    fetch('http://localhost:8080/auth/create', {
      method: "POST",
      body: JSON.stringify({
        userName: username,
        password: password,
        phoneNumber: phoneNumber,
        email: email
      }),
      headers: {
        "Content-type": "application/json; charset=UTF-8",
        "Origin": "http://localhost:3000"
      },
      credentials: "include"
    })
    .then(response => response.json())
    .then(json => {
      console.log(json)
      setIsLoading(false)
      navigate('/login');
    })
    .catch(error => console.error(error));
  }




  return (
    <div style={{ display: 'flex', height: '100vh' }}>
      <div style={{ width: '50vw', backgroundColor: '#0A3C57' }}></div>
      <div style={{ display: 'flex', width: '50vw', flexDirection: 'column', alignItems: 'center' }}>
        <div style={{ width: '80%', display: 'flex', flexDirection: 'column', textAlign: 'left' }}>
          <div style={{ display: 'flex', flexDirection: 'row', alignItems: 'center', marginTop: '20px' }}>
            <div style={{ backgroundColor: '#8EC6DD', height: '6vh', width: '6vh', borderRadius: '100%', marginRight: '15px' }} />
            <span style={{ fontSize: '20px' }}>BestBuds</span>
          </div>
          <div style={{ paddingTop: '20vh', display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center' }}>
            <h2>Welcome!</h2>
            <form onSubmit={handleSubmit}>
              <input style={{ width: '100%' }} type="text" placeholder="Username" value={username} onChange={handleUsernameChange} />
              <br />
              <input style={{ width: '100%' }} type="text" placeholder="Phone Number" value={phoneNumber} onChange={handlePhoneNumberChange} />
              <br />
              <input style={{ width: '100%' }} type="text" placeholder="Email" value={email} onChange={handleEmailChange} />
              <br />
              <input style={{ width: '100%' }} type="password" placeholder="Password" value={password} onChange={handlePasswordChange} />
              <br />
              <button onClick={handleClicked} style={{ width: '100%' }} type="submit">Create Account</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  );
};

export default CreateAccount;