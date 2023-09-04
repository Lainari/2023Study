import crypto from 'crypto';
import * as fs from 'fs';
import path from 'path';

const salt = crypto.randomBytes(32).toString('hex');
fs.writeFileSync(path.resolve('./config', 'salt'), salt);
