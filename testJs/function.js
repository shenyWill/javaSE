function a(){
    b();
    function b(){
        console.log("b");
    }
}
a()