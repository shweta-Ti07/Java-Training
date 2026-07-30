export const CustomerComponent=(props)=>{
    return(
        <div>
            <h1>CustomerComponent</h1>
            
            <h1>Customer Name: {props.name} </h1>
            <h1>Role : {props.role}</h1>
        </div>
    )
}