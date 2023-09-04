import * as fs from 'fs';
import path from 'path';
export const getSalt = () => {
    return fs.readFileSync(path.resolve('./config', 'salt'));
}