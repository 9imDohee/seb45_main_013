import { useNavigate } from 'react-router-dom';
import { styled } from 'styled-components';

const StyledButton = styled.button`
  display: flex;
  align-items: center;
  justify-content: center;

  padding: ${(props) => props.theme.spacing[4]} ${(props) => props.theme.spacing[8]};
  border: none;
  border-radius: ${(props) => props.theme.spacing[4]};

  background-color: ${(props) => props.theme.colors.mainBlue};

  color: #fff;

  &:hover {
    background-color: ${(props) => props.theme.colors.subBlue};
  }

  &:active {
    background-color: ${(props) => props.theme.colors.darkBlue};
  }
`;

interface ButtonProps {
  text: string;
  link?: string;
}

const Button = ({ text, link }: ButtonProps) => {
  const navigate = useNavigate();
  const handleClick = () => {
    if (link) {
      navigate(link);
    }
  };

  return <StyledButton onClick={handleClick}>{text}</StyledButton>;
};

export default Button;
