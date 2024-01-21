
import PlantReco from './PlantReco';
import "./Dashboard.css"

const RecoModal = ({openNewPlant}) => {
  return (
    <>
        <h2>Recommended Plants</h2>
        <PlantReco plantType="Cherry Tomato" openNewPlant={openNewPlant}/>
        <PlantReco plantType="Basil" openNewPlant={openNewPlant}/>
    </>
  );
};

export default RecoModal;
