const fs =require('fs');

const fileName =__dirname + '/test.txt';

fs.readFile(fileName,(err, data)=>{
    if(err){
        console.eroor(err);

    }
    console.log(data.toString());
});

const data= fs.readFileSync(fileName);
console.log(data.toString());