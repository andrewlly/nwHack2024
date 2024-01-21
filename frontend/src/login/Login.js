import React from 'react';
import './Login.css';
import { useState } from 'react';
import { Link } from 'react-router-dom';
import { useNavigate } from 'react-router-dom';

const Login = () => {
    const [login, setLogin] = useState('');
    const [password, setPassword] = useState('');
    const navigate = useNavigate();

    const handleLoginChange = (e) => {
        setLogin(e.target.value);
    };

    const handlePasswordChange = (e) => {
        setPassword(e.target.value);
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        // API call and Authentication
        navigate('/dashboard');
    };

    const handleClicked = () => {
        tryLogin()
    }

    const tryLogin = () => {
        fetch('http://localhost:8080/auth/login', {
            method: "POST",
            body: JSON.stringify({
                email: 'john.doe@example.com',
                password: "1234"
            }),
            headers: {
                "Content-type": "application/json; charset=UTF-8",
                "Origin": "http://localhost:3000"
            },
            credentials: "include"
        }).then(response => response.json())

            .then(json => {
                console.log(json);
            }).catch(error => console.error(error));
    }


    return (
        <div style={{display: 'flex', height: '100vh'}}>
            <div style={{width: '50vw', backgroundColor: '#0A3C57'}}></div>
            <div style={{ display: 'flex', width: '50vw', flexDirection: 'column', alignItems: 'center' }}>
                <div style={{ width: '80%', display: 'flex', flexDirection: 'column', textAlign: 'left'}}>
                    <div style={{display: 'flex', flexDirection: 'row', alignItems: 'center', marginTop: '20px'}}>
                        <div style={{ backgroundColor: '#8EC6DD', height: '6vh', width: '6vh', borderRadius: '100%', marginRight: '15px'}} />
                        <span style={{fontSize: '20px'}}>BestBuds</span>
                    </div>
                    <div style={{ paddingTop: '20vh', display: 'flex', flexDirection: 'column', alignItems: 'center', justifyContent: 'center'}}>
                        <h2>Welcome Back</h2>
                        <form onSubmit={handleSubmit}>
                            <input style={{ width: '100%' }} type="text" placeholder="Username" value={login} onChange={handleLoginChange} />
                            <br />
                            <input style={{ width: '100%' }} type="password" placeholder="Password" value={password} onChange={handlePasswordChange} />
                            <br />
                            <button onClick={handleClicked} style={{ width: '100%'}} type="submit">Login</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    );
};

export default Login;