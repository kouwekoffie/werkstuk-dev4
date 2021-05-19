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
            return `${boxName} \n ${powerInstructions} \n ${boxStats} \n ${volumeInstructions} \n`;
        }
    }

}

const powerInstructionManual = instructionManual(powerInstructions)
const powerInstructionManualWithVolumeInstructions = powerInstructionManual(volumeInstructions)

const boxInstructionManual = boxes.map(powerInstructionManualWithVolumeInstructions)


console.log(boxInstructionManual);