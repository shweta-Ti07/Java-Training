import logo from './logo.svg';
import './App.css';
import { Hello } from './components/hello';
import { Counter } from './components/counter';
import { Login } from './components/login';
import { UseContext } from './components/UseContext';

function App() {
  return (
    // jsx element js+xml
    <>
    <div>
      {/* <UseContext.Provider value="swapna">     
         <Hello />
      </UseContext.Provider>*/}

      <Counter/> 
    {/* <Login/> */}
    </div>
    </>
  );
}

export default App;
