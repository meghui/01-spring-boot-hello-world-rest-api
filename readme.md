# Payslip RESTful API running on port 5000

This project is to demo how to automatically deployed to AWS through CodePipeline.

Use POST via http://springbootpaysliprestapi-env.eba-ymvs2cim.us-east-1.elasticbeanstalk.com/payslip

Example of Body in raw JSON:[{"firstName":"Peterson","lastName":"Riud","annualSalary":60050,"startDateOfPayment":"1 March","superRate":0.09},{"firstName":"Ryan","lastName":"Chen","annualSalary":120000,"startDateOfPayment":"1 March","superRate":0.1},{"firstName":"David","lastName":"Rudd","annualSalary":60050,"startDateOfPayment":"1 March","superRate":0.09},{"firstName":"Ran","lastName":"Chen","annualSalary":120000,"startDateOfPayment":"1 March","superRate":0.1}]
