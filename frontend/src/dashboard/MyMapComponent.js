import React from 'react';

const MyMapComponent = () => {
  return (
    <div>
      <iframe
        title="Mappedin Map"
        name="Mappedin Map"
        scrolling="no"
        width="100%"
        height="650"
        frameBorder="0"
        style={{ border: 0 }}
        src="https://maker.mappedin.com/map/65ad5f5383bd240b9aaf48bd?embedded=true"
      ></iframe>
    </div>
  );
};

export default MyMapComponent;