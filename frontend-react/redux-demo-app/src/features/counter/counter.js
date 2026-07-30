import { useDispatch, useSelector } from "react-redux"
import { decrement, increment, reset } from "./counterSlice";
import "/node_modules/bootstrap/dist/css/bootstrap.min.css"
export const Counter=()=>{

    const count=useSelector(
        (state)=>state.counter.value
    );

    const dispatch=useDispatch();

    return(
        <div className="container mt-4 text-center">
            <h1>Redux Demo</h1>
            <h1>Count : {count}</h1>

            <button className="btn btn-primary ms-4" onClick={()=>dispatch(increment())}>Increment</button>
            <button className="btn btn-primary ms-4" onClick={()=>dispatch(decrement())}>Decrement</button>
            <button className="btn btn-primary ms-4" onClick={()=>dispatch(reset())}>Reset</button>


        </div>
    );

}
