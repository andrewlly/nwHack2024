import React from 'react';
import './Dashboard.css';

const Profile = () => {
  return (
    <div className="profile-container">
      <div className="profile-image"></div>
      <div className="profile-info-container">
        <h3 className="profile-name">Jane Doe</h3>
        <p className="profile-description">We be-leaf in you!</p>
      </div>
    </div>
  );
};

export default Profile;
