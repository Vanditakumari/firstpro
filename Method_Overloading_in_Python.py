#!/usr/bin/env python
# coding: utf-8

# ***Unlike other programming languages like Java, C++, and C#, Python does not support the feature of method overloading by default.
# Python's standard library doesn't have any other provision for implementing method overloading. We can use a dispatch function from a third-party module named MultipleDispatch for this purpose.***

# In[1]:


get_ipython().system('pip install multipledispatch')


# In[2]:


from multipledispatch import dispatch
class example:
   @dispatch(int, int)
   def add(self, a, b):
      x = a+b
      return x
   @dispatch(int, int, int)
   def add(self, a, b, c):
      x = a+b+c
      return x

obj = example()

print (obj.add(10,20,30))
print (obj.add(10,20))


# In[ ]:




