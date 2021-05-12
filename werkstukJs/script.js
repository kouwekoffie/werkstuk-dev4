const pipe = function (...fns) {
    return function (x) {
        return fns.reduce(function (v, f) {
            return f(v);
        }, x);
    }
};

const boxes = [{
    name: "SamsungBox",
    stats: "BIG SOUND & DEEP BASS, UP TO 12 HOURS, ACCESS TO VOICE ASSISTANTS, SPEAKERPHONE, MAXVOLUME: 10"
}, {
    name: "BoseBox",
    stats: "WATERPROOF, UP TO 30 HOURS, STEREO, COMPACT, MAXVOLUME: 100"
}]

const powerInstructions = "Press the powerButton on the remote to turn the box on or off,";
const volumeInstructions = "Press the volumeUpButton on the remote to increase the volume,";

const instructionManual = (powerInstructions) => {
    return function (volumeInstructions) {
        return function (box) {
            const boxName = box.name;
            const boxStats = box.stats;
            let str = box
            return `${boxName} \n ${powerInstructions} \n ${boxStats} \n ${volumeInstructions} \n`;
        }
    }

}

// const instructionManual = pipe(box.name, powerInstructions, box.stats, volumeInstructions);

const boxInstructionManual = boxes.map(instructionManual(powerInstructions, volumeInstructions))

console.log(boxInstructionManual);