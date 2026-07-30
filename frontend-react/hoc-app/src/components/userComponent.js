import { WelcomeComponent } from "./welcome"

export const UserComponent=(props)=>{

    return(
        <>
        <div>
            <h1>UserComponent</h1>
            <h1> User Name: {props.name} </h1>
            <h1>Role : {props.role}</h1>
        </div>
        {/* <WelcomeComponent myname={props.myname}></WelcomeComponent> */}
        </>
    )

}