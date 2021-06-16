describe ('Cypress Tests', () => {
    it('privat-mobile-pay_test', () => {

            cy.log('Переход на страницу пополнения')
            cy.visit('https://next.privat24.ua/mobile')
           
            cy.log('Ввод номера')
            cy.get('input[data-qa-node="phone-number"]')
            .type('992725554')
            
            cy.log('Сумма')
            cy.get('input[data-qa-node="amount"]')
            .type('100')
            

            cy.log('Номер карты')
            cy.get('input[data-qa-node="numberdebitSource"]')
            .type('5309233034765085')

            cy.log('Срок действия')
            cy.get('input[data-qa-node="expiredebitSource"]')
            .type('01/24')
            
            cy.log('CVV-код')
            cy.get('input[data-qa-node="cvvdebitSource"]')
            .type('891')

            cy.log('Имя')
            cy.get('input[data-qa-node="firstNamedebitSource"]')
            .type('Денис')

            cy.log('Фамилия')
            cy.get('input[data-qa-node="lastNamedebitSource"]')
            .type('Устименко')

            cy.log('В корзину')
            cy.get('button[type="submit"]').click()

    })

})



