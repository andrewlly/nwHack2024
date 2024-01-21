const PlantReco = ({plantType, openNewPlant}) => {

    const handleClick = () => {
        openNewPlant(plantType);
    }

    return (
        <div className="recommendation-container">
          <div style={{ display: 'flex', justifyContent: 'space-between', width: '100%' }}>
            <div style={{ display: 'flex', alignItems: 'center' }}>
              <div className="task-icon"></div>
              <div>
                <p style={{ margin: 0 }}>{plantType}</p>
                <p style={{ margin: 0 }}>Difficulty: <span>stars</span></p>
              </div>
            </div>
            <div className="add-plant-button" onClick={() => handleClick()}>+</div>
          </div>
        </div>
      );
      
};

export default PlantReco;
