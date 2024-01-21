import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { faStar as solidStar } from "@fortawesome/free-solid-svg-icons";
import { faStar as regularStar } from "@fortawesome/free-regular-svg-icons";

const PlantReco = ({plantType, openNewPlant}) => {

    const handleClick = () => {
        openNewPlant(plantType);
    }

    return (
        <div className="recommendation-container">
          <div className="plantRec" style={{ display: 'flex', justifyContent: 'space-between', width: '100%' }}>
            <div style={{ display: 'flex', alignItems: 'center' }}>
              <div className="task-icon"></div>
              <div>
                <p style={{ margin: 0, fontWeight: 'bold'}}>{plantType}</p>
                <p style={{ margin: 0 }}>Difficulty: <span style={{color: '#b4e8d0'}}><FontAwesomeIcon icon={solidStar} /><FontAwesomeIcon icon={regularStar} /><FontAwesomeIcon icon={regularStar} /></span></p>
              </div>
            </div>
            <div style={{marginRight:'20px'}} className="add-plant-button-green" onClick={() => handleClick()}>+</div>
          </div>
        </div>
      );
      
};

export default PlantReco;
