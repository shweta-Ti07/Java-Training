import { useEffect, useRef, useState } from "react";
import "/node_modules/bootstrap/dist/css/bootstrap.min.css"
export const Login=()=>{

    // const[uname,setUname]=useState("");
    // const[pwd,setPwd]=useState("");

    const unameRef=useRef("")
    const pwdRef=useRef("")

    const handleSubmit=(event)=>{
        event.preventDefault();
        console.log(unameRef.current.value)
        console.log(pwdRef.current.value)

    }
        useEffect(() => {
        console.log("Component rendered");
        });

    return(
        <div className="container-fluid mt-3">
            
            <div className="card">
                <div className="row bg-primary text-light">
                <h1>Login Form</h1>
                </div>
                <div>
                <form  onSubmit={handleSubmit}>
        
                <div className="card-body" >
                    <label className="form-label">Username</label>
                    <input type="text" className="form-control"
                    ref={unameRef}
                    // // onChange={(event)=>{setUname(event.target.value)
                    //     console.log(uname)
                    // }}
                    placeholder="Enter username"></input>
                </div>

                <div className="card-body">
                    <label className="form-label">Password</label>
                    <input type="password" className="form-control"
                    ref={pwdRef}
                    // onChange={(event)=>setPwd(event.target.value)}
                    placeholder="Enter password"></input>
                </div>
                <div className="text-center">
                    <button className="btn btn-primary btn-lg mt-3 mb-3 " type="submit">Login</button>
                </div>
                </form>
                </div>
            </div>
      </div>
    )
}
