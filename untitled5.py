# -*- coding: utf-8 -*-
"""Untitled5.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/1YIAiiIRgQvoGkgtb1wnENtfjNs6wEprk
"""

class Student:
    def _init_(self, name, age, salary, pan, address):
        self.name = name
        self.age = age
        self.salary = salary
        self.pan = pan
        self.address = address

    def _eq_(self, other):
        if isinstance(other, Student):
            return (self.name == other.name and
                    self.age == other.age and
                    self.salary == other.salary and
                    self.pan == other.pan and
                    self.address == other.address)
        return False

    def _hash_(self):
        return hash((self.name, self.age, self.salary, self.pan, self.address))

    def _str_(self):
        return (f"name={self.name}, age={self.age}, salary={self.salary}, "
                f"PAN={self.pan}, address={self.address}")

class CustomSet:
    def _init_(self):
        self.items = []

    def add(self, student):
        self.items.append(student)

    def _iter_(self):
        return iter(self.items)

# Example usage
if __name__ == "_main_":
    ram = Student("Ram", 20, 30000, "ABC123", "Kolkata")
    ram1 = Student("Ram", 20, 30000, "ABC123", "Kolkata")  # Duplicate

    custom_set = CustomSet()
    custom_set.add(ram)
    custom_set.add(ram1)  # This will be allowed since we're using a list

    for student in custom_set:
        print(student)