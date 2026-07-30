import logo from './logo.svg';
import './App.css';
import { List } from './components/list';
import { Link, Route, Routes } from 'react-router-dom';
import { AddEmployee } from './components/addEmployee';
import { UpdateEmployee } from './components/updateEmployee';
import { InfoEmployee } from './components/infoEmployee';
import "/node_modules/bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <>
    <nav className="navbar navbar-expand-lg navbar-light bg-primary ">
      <div className="container-fluid">
      <Link to={`/`} className="nav-link active text-light">Employee Management Applicaiton</Link> 
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <Link to={`/add`} className="nav-link active text-light">AddEmployee</Link> 
        </li>
        </ul>
    </div>
    </nav>
      
   
     <Routes>

      <Route path="/" element={<List />} />

      <Route path="/employees" element={<List />} />

      <Route path="/add" element={<AddEmployee />} />

      <Route path="/update/:id" element={<UpdateEmployee />} />

      <Route path="/info/:id" element={<InfoEmployee />} />

    </Routes>
    </>
     
  );
}

export default App;
