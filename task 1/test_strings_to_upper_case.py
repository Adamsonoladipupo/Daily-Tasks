import unittest
from strings_to_upper_case import to_upper

class TestTOUpperFunction(unittest.TestCase):
	def test_if_to_upper_function_convert_strings_to_upper_case(self):
		expected = "WORDS"
		actual = to_upper("words")
		self.assertEqual(actual, "WORDS")

	def test_if_to_upper_function_rejects_integer(self):
		