console.log('Hello World');

const os=require('os');

console.log('Architecture '+os.arch());
console.log('CPUs ' + os.cpus().length);
console.log('OS ' + os.platform());