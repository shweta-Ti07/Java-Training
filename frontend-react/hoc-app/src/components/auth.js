export const Auth=(WrappedComponent)=>{

    return function AuthenticationComponent(props){

        const isLoggedIn=props.isLoggedIn;
        
            if(!isLoggedIn){
                return (
            <div>
                
                <WrappedComponent{...props}></WrappedComponent>
                 <h3>Please login to continue</h3>
             </div>
                )}
            
            return(
                <WrappedComponent{...props}></WrappedComponent>
            )
    }   

}