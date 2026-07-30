import { useContext, useReducer, useState } from "react"
import "/node_modules/bootstrap/dist/css/bootstrap.min.css"
import { UseContext } from "./UseContext";
export const Counter=()=>{
    // const myname=useContext(UseContext);
    // const[count,setCount]=useState(0);

    const reducer=(state,action)=>{

        switch(action.type){
            case 'increment':return state+1;
            case 'decrement': return state>0?state-1:0;
            case 'reset' : return 0;
            default :return state
        }
    }
    const [count , dispatch]=useReducer(reducer,0)
    
    return(
       <div>
            <h1>Count : {count}</h1>
            {/* <button class="btn btn-primary ms-4" onClick={()=>setCount(count+1)}>Increment</button>
            
            <button class="btn btn-primary ms-4" onClick={()=>setCount(count>0?count-1:0)}>Decrement</button>
            <button class="btn btn-primary ms-4" onClick={()=>setCount(0)}>Reset</button> */}

            <button class="btn btn-primary ms-4" onClick={()=>dispatch({type:'increment'})}>Increment</button>
            <button class="btn btn-primary ms-4" onClick={()=>dispatch({type:'decrement'})}>Decrement</button>
            <button class="btn btn-primary ms-4" onClick={()=>dispatch({type:'reset'})}>Reset</button>
            {/* <h1>{myname}</h1> */}
       </div> 
    )
}