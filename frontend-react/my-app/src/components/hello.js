import { useState } from "react"
import { Hi } from "./hi";
import { Counter } from "./counter";

export function Hello(){

    //useState hook
    const [name,setName]=useState("swapna");

    // const changename=()=>{
    //     setName("Swapna Motupally")
    // }

    return(
        <div>
            <h1>Hello function component</h1>
            {/* <h1>Myname from parent app component is {props.myname} </h1> */}
            {/* <h1>my state info of name is {name}</h1>
            <button onClick={()=>setName("Swapna Motupally")}></button>
            <h1>my state info of name is {name} after onclick</h1> */}
            <Hi></Hi>
           
        </div>
    )
}

// import { Component } from "react";
// export class Hello extends Component{
//     name="swapna"
//     render(){
//         return(
//             <div>
//                 <h1>Hello Class Component welcomes  {this.name}</h1>
//                 <h1>Myname from parent app component is  {this.props.myname}</h1>
//             </div>
//         )
//     }
// }