const { fizzBuzz } = require('./fizzBuzz')

test('fizz is returned on 3', () => {
    expect(fizzBuzz(3)).toBe('fizz')
});
