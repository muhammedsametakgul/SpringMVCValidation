# SpringMVCValidation
This repository includes some validation types 

Note for reader : Please ignore UI for now:) I am following Spring 6 , Spring Boot3 and Hibernate course on Udemy. I will also improve myself in UI:)

-------------------------------

1. @NotNull
   When we use this annotation, if the variable we are using with this annotiaton is null, it sends us a warning message.
   
![notnull](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/c7930c12-7d7e-4c6e-b2a9-50af7ad3661d)

2. @Min
   When we use this annotiation, if the variable we are using with this annotiation is lower than we determined, it sends us a warning message.
   
   ![Min](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/83a37e2d-7369-45fa-b4b6-17c50fae5328)

3. @Max
   When we use this annotiation, if the variable we are using with this annotiation is bigger than we determined, it sends us a warning message.

   ![max](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/23907ab1-f29c-4ec6-b096-f853b8653f0c)

4. @Pattern
   When we use this annotiation, the input must match the pattern we gave on code. Otherwise, it will send us a warning message.

   ![pattern](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/a636977f-d2ac-4b9a-a007-f01d01301940)

5. Custom Annotiation
   We can also create our own annotiations. For this,

   ![image](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/2604f988-d032-4157-b4cb-a78848c65d07)

   This @annotiation class is an annotiation schema for us.

   ![image](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/25f56d0a-b720-4798-85c4-0603bbf9cc46)

   This class gives anootiation's class task and tell it what to do in code.

   ![image](https://github.com/muhammedsametakgul/SpringMVCValidation/assets/93324656/6eeac86a-e731-43d5-a3d8-f7976ea493a8)

