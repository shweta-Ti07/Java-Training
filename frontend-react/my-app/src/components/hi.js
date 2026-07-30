import { useContext } from "react"
import { UseContext } from "./UseContext"

export const Hi=()=>{
    //usecontext avoids prop drilling
    const myname=useContext(UseContext)
    return(
        <div>
            <h1>hi.....</h1>
            <h2>{myname}</h2>
        </div>
    )
}