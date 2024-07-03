// routes/userRoutes.js
import express from 'express';
import User from '../model/user.js';

const router = express.Router();

router.post('/user', async (req, res) => {
	const { name, age } = req.body;
	const user = new User({ name, age });
	try {
		const savedUser = await user.save();
		res.status(201).json(savedUser);
	} catch (err) {
		res.status(400).json({ message: err.message });
	}
});

// /user?name=text
router.get('/user', async (req, res) => {
	try {
		const user = await User.findOne({ name: req.query.name });
		if (!user) return res.status(404).json({ message: 'User not found' });
		res.json(user);
	} catch (err) {
		res.status(500).json({ message: err.message });
	}
});

router.put('/user/:name', async (req, res) => {
	const { age } = req.body;
	try {
		const updatedUser = await User.findOneAndUpdate(
			{ name: req.params.name },
			{ age },
			{ new: true }
		);
		if (!updatedUser) return res.status(404).json({ message: 'User not found' });
		res.json(updatedUser);
	} catch (err) {
		res.status(400).json({ message: err.message });
	}
});

router.delete('/user/:name', async (req, res) => {
	try {
		const deletedUser = await User.findOneAndDelete({ name: req.params.name });
		if (!deletedUser) return res.status(404).json({ message: 'User not found' });
		res.json({ message: 'User deleted successfully' });
	} catch (err) {
		res.status(500).json({ message: err.message });
	}
});

export default router;
