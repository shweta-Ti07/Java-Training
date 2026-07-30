// export const WelcomeComponent=(props)=>{

//     return(
//         <div>
//             <h1>Welcome {props.myname}</h1>
//         </div>
//     )

// }

export const WelcomeComponent=(WrappedComponent)=>{
    return function EnhancedComponent(props){
        return (
            <div>
                <h1>Enhanced Component Demo</h1>
                <h1>Welcome....</h1>
                <WrappedComponent {...props}/>
            </div>
        )
    }
}