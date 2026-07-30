
import './App.css';
import { Auth } from './components/auth';
import { CustomerComponent } from './components/CustomerComponent';
import { UserComponent } from './components/userComponent';
import { WelcomeComponent } from './components/welcome';

//  const EnhancedUser=WelcomeComponent(UserComponent)
//  const EnhancedCustomer=WelcomeComponent(CustomerComponent)

const AuthenticatedUser=Auth(UserComponent)
const AuthenticatedCustomer=Auth(CustomerComponent)

function App() {
  
  return (
    <div className="App">
        {/* <UserComponent myname="Swapna"/> */}
        {/* <EnhancedUser myname="Swapna"></EnhancedUser>
        <EnhancedCustomer msg="Customer name is : Amit"></EnhancedCustomer> */}
        <AuthenticatedUser isLoggedIn={true}
          name="swapna" role="admin"></AuthenticatedUser>
        <AuthenticatedCustomer isLoggedIn={false}
          name="amit" role="manager"></AuthenticatedCustomer>
    </div>
  );
}

export default App;
