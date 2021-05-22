const boxes = [{
    name: "SamsungBox",
    stats: "BIG SOUND & DEEP BASS, UP TO 12 HOURS, ACCESS TO VOICE ASSISTANTS, SPEAKERPHONE, MAXVOLUME: 10"
}, {
    name: "BoseBox",
    stats: "WATERPROOF, UP TO 30 HOURS, STEREO, COMPACT, MAXVOLUME: 100"
}, {
    name: "AppleBox",
    stats: "SUPER COMPATIBLE, QUICK CONNECT, UP TO 8 HOURS"
}, {
    name: "SonyBox",
    stats: "UP TO 30 HOURS, FAST CHARGE, WATERPROOF"
}, {
    name: "LGBox",
    stats: "WATERPROOF, UP TO 30 HOURS, MULTI COLOR LIGHTS, DUAL ACTION BASS"
}, {
    name: "GoogleBox",
    stats: "VOICE MATCH, SURROUND MODE, HANGS ON WALL"
}, {
    name: "UeBoomBox",
    stats: "WATERPROOF, 360 DEGREE SOUND, COMPATIBLE APP"
}, {
    name: "BeatsBox",
    stats: "BUILT-IN SPEAKEPHONE, SMALL SIZE, STEREO"
}]

// This orting algorithm is not pure functional.
// The less and greater arrays are side-effects.
const quickSort = (unsorted) => {
    if (unsorted.length < 2 ) {
        return unsorted;
    } else {
        let pivot = unsorted[0];
        let less = [];
        let greater = [];
        unsorted.splice(0, 1);
        pivotValues(unsorted, pivot.name, less, greater);
        return quickSort(less).concat(pivot).concat(quickSort(greater));
    }
}

function pivotValues(array, pivot, less, greater) {
    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        if (element.name.toUpperCase() <= pivot.toUpperCase()) {
            less.push(element);
        } else {
            greater.push(element);
        }
    }
}

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

const boxInstructionManual = quickSort(boxes).map(powerInstructionManualWithVolumeInstructions)

console.log(boxInstructionManual);